package com.xpf.android.factorymethod.factory;

import com.xpf.android.factorymethod.operator.AbstractExportOperator;
import com.xpf.android.factorymethod.operator.ExportDataBaseOperator;
import com.xpf.android.factorymethod.operator.ExportDefaultOperator;
import com.xpf.android.factorymethod.operator.ExportExcelOperator;
import com.xpf.android.factorymethod.operator.ExportTextOperator;

/**
 * @author x-sir :)
 * @date 2021/5/16
 */
public class SimpleFactory {

    public static final int TYPE_DB = 1;
    public static final int TYPE_TEXT = 2;
    public static final int TYPE_EXCEL = 3;

    public static AbstractExportOperator getExport(int type) {
        AbstractExportOperator operator;
        switch (type) {
            case TYPE_DB:
                operator = new ExportDataBaseOperator();
                break;
            case TYPE_TEXT:
                operator = new ExportTextOperator();
                break;
            case TYPE_EXCEL:
                operator = new ExportExcelOperator();
                break;
            default:
                operator = new ExportDefaultOperator();
                break;
        }

        return operator;
    }
}
