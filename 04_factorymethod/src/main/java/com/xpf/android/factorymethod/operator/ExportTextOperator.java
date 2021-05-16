package com.xpf.android.factorymethod.operator;

import com.xpf.android.factorymethod.exportor.ExportTextFile;
import com.xpf.android.factorymethod.exportor.IExportFile;

/**
 * @author x-sir :)
 * @date 2021/5/16
 */
public class ExportTextOperator extends AbstractExportOperator {

    @Override
    protected IExportFile newInstance() {
        return new ExportTextFile();
    }
}
