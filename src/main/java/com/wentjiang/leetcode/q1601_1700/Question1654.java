package com.wentjiang.leetcode.q1601_1700;

import java.util.*;

public class Question1654 {

    public static class CurrentState {
        private final int currentIndex;
        private final int count;
        private final boolean hasJumpBack;

        public CurrentState(int currentIndex, int count, boolean hasJumpBack) {
            this.currentIndex = currentIndex;
            this.count = count;
            this.hasJumpBack = hasJumpBack;
        }
    }

    public int minimumJumps(int[] forbidden, int a, int b, int x) {
        int jumpForward = a;
        int jumpBack = b;
        int target = x;
        Set<Integer> forbiddenSet = new HashSet<>();
        for (int num : forbidden) {
            forbiddenSet.add(num);
        }
        int bound = Math.max(Arrays.stream(forbidden).max().orElse(0) + jumpForward + jumpBack, target + jumpBack);

        Queue<CurrentState> states = new ArrayDeque<>();

        states.add(new CurrentState(0, 0, false));
        while (!states.isEmpty()) {
            CurrentState currentState = states.poll();

            if (currentState.currentIndex == target) {
                return currentState.count;
            }

            // 向右跳
            int jumpForwardIndex = currentState.currentIndex + jumpForward;
            if (!forbiddenSet.contains(jumpForwardIndex) && jumpForwardIndex <= bound) {
                states.add(new CurrentState(jumpForwardIndex, currentState.count + 1, false));
                forbiddenSet.add(jumpForwardIndex);
            }

            // 向左跳
            int jumpBackIndex = currentState.currentIndex - jumpBack;
            if (!currentState.hasJumpBack && jumpBackIndex > 0 && !forbiddenSet.contains(jumpBackIndex)) {
                states.add(new CurrentState(jumpBackIndex, currentState.count + 1, true));
            }
        }
        return -1;
    }

}
