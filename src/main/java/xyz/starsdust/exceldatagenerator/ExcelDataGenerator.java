package xyz.starsdust.exceldatagenerator;

import com.alibaba.excel.EasyExcel;
import xyz.starsdust.exceldatagenerator.excel.ReadExcel;
import xyz.starsdust.exceldatagenerator.util.Config;

public class ExcelDataGenerator {
    public static void main(String[] args) {
        Config.getInstance().loadConfig("/config.json");

        EasyExcel.read("input.xlsx", new ReadExcel()).sheet().doRead();
    }
}