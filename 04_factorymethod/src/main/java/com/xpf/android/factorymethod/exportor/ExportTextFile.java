package com.xpf.android.factorymethod.exportor;

/**
 * @author x-sir :)
 * @date 2021/5/16
 */
public class ExportTextFile implements IExportFile {

    @Override
    public void export(String data) {
        System.out.println("文本文件被导出了..." + data);
    }
}
