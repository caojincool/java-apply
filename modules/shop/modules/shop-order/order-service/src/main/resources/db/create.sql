create table shop_order (
   id bigint auto_increment,
   order_no varchar(32) comment '订单编号',
   from_source int default 1 comment '订单来源: 1--PC,2--无线',
   statu int default 0 comment '订单状态: 0:初始 1:待支付 2:待发货 3:已发货 5:交易成功 7:交易关闭',
   user_id bigint comment '买家ID',
   user_name varchar(128) comment '买家昵称',
   user_mobile varchar(11) comment '买家手机号',
   user_comment varchar(256) comment '买家备注',
   shop_id bigint comment '商店ID',
   shop_name varchar(128) comment '商店名称',
   shop_comment varchar(256) comment '商店备注',
   is_overbuy int default 0 comment '是否超卖: 0,正常 1,超卖',
   is_cancel int default 0 comment '是否取消 0--否,1--是',
   cancel_time datetime comment '订单取消时间',
   cancel_note varchar(128) comment '订单取消说明',
   price_amount bigint default 0 comment '订单价格',
   postage bigint default 0 comment '邮费',
   exchange_score int default 0 comment '兑换的积分数量',
   exchange_cash  bigint default 0  comment '兑换的金额',
   coupon_no varchar(32) comment '优惠券编码',
   coupon_price bigint default 0 comment '优惠券金额',
   discount_id int comment '活动id',
   discount_type int comment '活动类型',
   discount_desc varchar(128) comment '活动描述',
   discount_rule varchar(128) comment '满足的活动规则',
   discount_price bigint comment  '活动优惠的价格',
   pay_state int default 0 comment '支付状态: 0:未支付 1:支付成功 2:支付失败',
   pay_time datetime comment '买家付款时间',
   pay_account varchar(64) comment '支付账号',
   trade_no varchar(64) comment '第三方交易系统流水号',
   pay_channel int default 0 comment '支付渠道 0:无 1:支付宝 2:微信支付 3:网银',
   pay_id bigint comment '支付流水id',
   receiver_province_id int comment '收货人所属省ID',
   receiver_province_name varchar(36) comment '收货人所属省名称',
   receiver_city_id int comment  '收货人所属城市ID',
   receiver_city_name varchar(36) comment  '收货人所属城市名称',
   receiver_area_id int comment  '收货人所属区县ID',
   receiver_area_name varchar(36) comment '收货人所属区县名称',
   receiver_address varchar(256) comment '收货人地址ַ',
   receiver_name varchar(64) comment '收货人姓名',
   receiver_mobile varchar(20) comment '收货人手机号',
   receiver_address_id int comment '收货人地址ID',
   is_receive int default 0  comment '是否收货 0--未收货 1--已收货',
   receive_time datetime comment '收货时间',
   deliver_time datetime comment '发货时间',
   deliver_time_limit int comment '发货时限小时,超过此时间再发货则发货超时',
   remind_deliver_count int default 0 comment '买家提醒卖家发货的次数',
   is_delive int comment '是否发货 0--未发货 1--已发货',
   is_delive_timeout int comment '是否发货超时 0--否 1--是',
   express_id int comment '快递公司编码',
   express_name varchar(128) comment '快递公司名称',
   express_no varchar(128) comment '货运单号',
   create_time datetime comment '创建时间',
	 modified_time datetime comment '修改时间',
   modifier_id bigint comment '修改人Id',
  primary key(id),
  unique key (order_no),
  key trade_no(trade_no),
  key create_order(create_time,order_no),
  key shop_order(shop_id,order_no),
  key user_order(user_id,order_no),
  key paytime_order(pay_time,order_no),
  key receive_time_order(receive_time,order_no),
  key receiver_name_order (receiver_name,order_no),
  key receiver_mobile(receiver_mobile,order_no),
  key deliver_time(deliver_time,order_no),
  key express_no_order (express_no,order_no),
	key express_order (express_id,order_no)
) ENGINE=InnoDB default charset=utf8 comment '订单表';

create table order_pay 
(
   id  bigint AUTO_INCREMENT comment '自增长id',
   order_no varchar(32) COMMENT '订单编号',
   pay_channel int comment '支付渠道 1--支付宝,2--微信 3--网银',
   amount bigint default 0 comment '金额,单位:分',
   result int default 0 comment '支付结果 0--初始化 1--成功  2--失败',
   pay_time datetime comment '支付时间',
   pay_account varchar(64) comment '支付账号',
   prepay_id varchar(64) comment '微信预支付标识',
   trade_no varchar(64) comment '交易流水号',
   create_time datetime comment '创建时间',
   modified_time datetime comment '修改时间',
   PRIMARY KEY (id),
   KEY idx_order_pay (order_no),
   KEY idx_paytime_order (pay_time,order_no),
   KEY idx_createtime_order (create_time,order_no)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 comment '支付流水表';

-- order_detail 订单详单表

--
insert into shop_order values(1,'20171217001',1,1,1,'阿一','11111111111','',1,'全球杂货店','',0,0,null,'',10000,1000,0,0,'',0,null,null,null,null,0,0,null,null,null,null,null,110000,'四川',111100,'成都',111111,'无名区','无名小区','无名','12222222222',null,0,null,null,8,0,0,0,null,'','',now(),now(),1);

create table order_operate_record (
   id bigint not null auto_increment,
   order_no varchar(32) comment '订单编号',
   pre_statu int comment '之前状态',
   cur_statu int comment '当前状态',
   operate_action int comment '操作动作 1--创建订单 2--付款',
   operate_desc varchar(128) comment '操作描述',
   operator_id bigint comment '操作人id',
   operator_name varchar(20) comment '操作人名',
   note varchar(256) comment '备注',
   create_time datetime comment '创建时间',
   modified_time datetime comment '修改时间',
   primary key(id),
   key idx_order(order_no),
   key idx_create_order(create_time,order_no)
) engine=InnoDB default charset=utf8 comment '订单操作流水表';

create table order_statu_change (
   id bigint not null auto_increment,
   order_no varchar(32) comment '订单编号',
   pre_statu int comment '之前状态',
   cur_statu int comment '当前状态',
   operator_id bigint comment '操作人id',
   operator_name varchar(20) comment '操作人名',
   operate_desc varchar(128) comment '操作描述',
   create_time datetime comment '创建时间',
   modified_time datetime comment '修改时间',
   primary key(id),
   key idx_order(order_no),
   key idx_create_order(create_time,order_no)
) engine=InnoDB default charset=utf8 comment '订单状态变更表';
