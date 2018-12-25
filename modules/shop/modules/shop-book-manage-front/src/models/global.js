import { queryNotices } from '../services/api';
import { queryCities } from '../services/user';
import { requestIsSuccess } from '../utils/utils';

export default {
  namespace: 'global',

  state: {
    collapsed: false,
    notices: [],
    cityTree: [],
  },

  effects: {
    *fetchNotices(_, { call, put }) {
      const data = yield call(queryNotices);
      yield put({
        type: 'saveNotices',
        payload: data,
      });
      yield put({
        type: 'user/changeNotifyCount',
        payload: data.length,
      });
    },
    *clearNotices({ payload }, { put, select }) {
      yield put({
        type: 'saveClearedNotices',
        payload,
      });
      const count = yield select(state => state.global.notices.length);
      yield put({
        type: 'user/changeNotifyCount',
        payload: count,
      });
    },
    *fetchCityTree(_, { put, call, select }) {
      let cityTree = [];
      const hasFetched = yield select(state => state.global.cityTree);
      if (hasFetched.length) {
        yield put({
          type: 'cityTree',
          data: hasFetched,
        });
        return;
      }
      try {
        cityTree = JSON.parse(localStorage.getItem('cityTree'));
      } catch (e) {}
      if (!cityTree || !cityTree.length) {
        const res = yield call(queryCities);
        if (requestIsSuccess(res)) {
          cityTree = res.data;
          localStorage.setItem('cityTree', JSON.stringify(cityTree));
        }
      }
      yield put({
        type: 'cityTree',
        data: cityTree,
      });
    },
  },

  reducers: {
    changeLayoutCollapsed(state, { payload }) {
      return {
        ...state,
        collapsed: payload,
      };
    },
    saveNotices(state, { payload }) {
      return {
        ...state,
        notices: payload,
      };
    },
    saveClearedNotices(state, { payload }) {
      return {
        ...state,
        notices: state.notices.filter(item => item.type !== payload),
      };
    },
    cityTree(state, { data }) {
      return {
        ...state,
        cityTree: data,
      };
    },
  },

  subscriptions: {
    setup({ history }) {
      // Subscribe history(url) change, trigger `load` action if pathname is `/`
      return history.listen(({ pathname, search }) => {
        if (typeof window.ga !== 'undefined') {
          window.ga('send', 'pageview', pathname + search);
        }
      });
    },
  },
};