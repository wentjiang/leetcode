package com.wentjiang.leetcode.q201_300;

import javafx.geometry.Side;

import java.util.*;


/**
 * 暂时放弃
 */
public class Question399 {
    public double[] calcEquation(List<List<String>> equations, double[] values, List<List<String>> queries) {
        double[] result = new double[queries.size()];
        Graph graph = generateGraph(equations, values);
        //todo 增加计算逻辑
        return result;
    }

    private Graph generateGraph(List<List<String>> equations, double[] values) {
        Map<String, List<Side>> sides = new HashMap<>();
        for (int i = 0; i < equations.size(); i++) {
            List<String> list = equations.get(i);
            String startString = list.get(0);
            String endString = list.get(1);
            Side side = new Side(startString, endString, values[i]);
            if (sides.containsKey(startString)) {
                sides.put(startString, Collections.singletonList(side));
            } else {
                sides.get(startString).add(side);
            }
            Side side1 = new Side(endString, startString, 1 / values[i]);
            if (sides.containsKey(endString)) {
                sides.put(endString, Collections.singletonList(side1));
            } else {
                sides.get(endString).add(side);
            }
        }
        return new Graph(sides);
    }

    static class Graph {
        //起始点的边   key   边
        private Map<String, List<Side>> sides;


        public Graph(Map<String, List<Side>> sides) {
            this.sides = sides;
        }

        double getValue(String startPoint, String endPoint) {

            return 0;
        }

        /**
         * 广度遍历
         */
        List<String> getPath(String startPoint, String endPoint, List<String> currentPath) {
            currentPath.add(startPoint);
            return null;
        }
    }

    static class Side {
        private String startString;
        private String endString;
        private double value;

        public Side(String startString, String endString, double value) {
            this.startString = startString;
            this.endString = endString;
            this.value = value;
        }

        public String getStartString() {
            return startString;
        }

        public String getEndString() {
            return endString;
        }

        public double getValue() {
            return value;
        }
    }
}
