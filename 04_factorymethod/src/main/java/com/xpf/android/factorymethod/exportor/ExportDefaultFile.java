package com.xpf.android.factorymethod.exportor;

/**
 * @author x-sir :)
 * @date 2021/5/16
 */
public class ExportDefaultFile implements IExportFile {

    @Override
    public void export(String data) {
        System.out.println("默认文件被导出了..." + data);
    }
}
