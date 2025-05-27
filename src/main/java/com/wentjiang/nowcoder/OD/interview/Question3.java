package com.wentjiang.nowcoder.OD.interview;

import java.util.List;
import java.util.Objects;

public class Question3 {
//    **编程题目（面试官出的考核题目**
//
//    日期区间结构包含两个字段：开始日期和结束日期。 如：开始日期: 2021-01 结束日期：2021-02。
//
//    判断List<日期区间>是否有交集。
//
//            1、有交集，输出字符串：有交集；
//
//            2、若没有交集：
//
//            1）可以合并，如： 开始日期: 2021-01 结束日期：2021-02，开始日期: 2021-03 结束日期：2021-04；
//
//            ​         合并后开始日期: 2021-01 结束日期：2021-04。
//
//            ​         输出字符串：无交集，可以合并；
//
//            \2) 不可以合并，如：开始日期: 2021-01 结束日期：2021-02，开始日期: 2021-04 结束日期：2021-05。
//
//            ​          输出字符串：无交集，且不可以合并；

    public static String getResult(List<String> firstDateRange, List<String> secondDateRange) {
        String firstStartDate = firstDateRange.get(0);
        String firstEndDate = firstDateRange.get(1);

        String secondStartDate = secondDateRange.get(0);
        String secondEndDate = secondDateRange.get(1);

        //判断起始日期的大小
        Integer[] firstStartDateArray = getYearAndMonth(firstStartDate);
        Integer[] secondStartDateArray = getYearAndMonth(secondStartDate);
        Integer[] firstEndDateArray = getYearAndMonth(firstStartDate);
        Integer[] secondEndDateArray = getYearAndMonth(secondEndDate);

        //先排序, 找到较小的起始日期
        int stratDateCompareResult = compareDateArray(firstStartDateArray, secondStartDateArray);

        //找到较小的终止日期
        int endDateCompareResult = compareDateArray(firstEndDateArray, secondEndDateArray);


        //没有交集的情况
        if (compareDateArray(firstStartDateArray, secondEndDateArray) == 1 || compareDateArray(secondStartDateArray, firstEndDateArray) == -1){
            //需要判断年份相同,月份是否相邻的情况

            return "";
        }
        //有交集的情况
        //如果第一个的起始日期大于第二个的终止日期 或者 第二个的起始大于第一个的终止,则有交集
        if (compareDateArray(firstStartDateArray, secondEndDateArray) > 0 || compareDateArray(secondStartDateArray, firstEndDateArray) > 0){

        }


            return "";
    }

    public static Integer[] getYearAndMonth(String dateString) {
        String[] arr = dateString.split("-");
        return new Integer[]{Integer.parseInt(arr[0]), Integer.parseInt(arr[1])};
    }

    public static int compareDateArray(Integer[] dataArray1, Integer[] dataArray2) {
        //年份相同比较月份
        if (Objects.equals(dataArray1[0], dataArray2[0])) {
            if (dataArray1[1] > dataArray2[1]) {
                return 1;
            }else if (dataArray1[1] < dataArray2[1]){
                return -1;
            }else{
                return 0;
            }
        } else if(dataArray1[0] > dataArray2[0]){
            return 1;
        } else {
            return 0;
        }
    }
}
