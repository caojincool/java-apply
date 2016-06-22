package com.ocean.parser;

import java.util.ArrayList;
import java.util.List;

/**
 * sql条件类
 */
public class SqlCondition {

    private Column column;

    private BinaryOperator operator;

    private List<Comparable<?>> values = new ArrayList<Comparable<?>>();

    public SqlCondition()
    {

    }

    public SqlCondition(Column column, BinaryOperator operator)
    {
        this.column=column;
        this.operator=operator;
    }

    public Column getColumn() {
        return column;
    }

    public void setColumn(Column column) {
        this.column = column;
    }

    public BinaryOperator getOperator() {
        return operator;
    }

    public void setOperator(BinaryOperator operator) {
        this.operator = operator;
    }

    public List<Comparable<?>> getValues() {
        return values;
    }

    public void setValues(List<Comparable<?>> values) {
        this.values = values;
    }

    /**
     * 列对象
     */
    public static class Column {

        private String columnName;

        private String tableName;

        public Column()
        {

        }

        public Column(String columnName,String tableName)
        {
            this.columnName=columnName;
            this.tableName=tableName;
        }

        public String getColumnName() {
            return columnName;
        }

        public void setColumnName(String columnName) {
            this.columnName = columnName;
        }

        public String getTableName() {
            return tableName;
        }

        public void setTableName(String tableName) {
            this.tableName = tableName;
        }
    }

    /**
     * 操作符枚举
     */
    public enum BinaryOperator {

        EQUAL("="), BETWEEN("BETWEEN"), IN("IN"), NOT_IN("NOT IN");

        private String expression;

        private BinaryOperator(String expression)
        {
            this.expression=expression;
        }

        public String toString() {
            return expression;
        }
    }
}