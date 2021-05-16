package com.xpf.android.factorymethod.operator;

import com.xpf.android.factorymethod.exportor.IExportFile;

/**
 * @author x-sir :)
 * @date 2021/5/16
 */
public abstract class AbstractExportOperator {

    public void export(String data) {
        IExportFile file = newInstance();
        file.export(data);
    }

    protected abstract IExportFile newInstance();
}
