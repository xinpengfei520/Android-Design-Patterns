package com.xpf.android.factorymethod.operator;

import com.xpf.android.factorymethod.exportor.ExportDataBaseFile;
import com.xpf.android.factorymethod.exportor.IExportFile;

/**
 * @author x-sir :)
 * @date 2021/5/16
 */
public class ExportDataBaseOperator extends AbstractExportOperator {

    @Override
    protected IExportFile newInstance() {
        return new ExportDataBaseFile();
    }
}
