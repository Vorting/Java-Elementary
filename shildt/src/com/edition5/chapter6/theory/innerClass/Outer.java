package com.edition5.chapter6.theory.innerClass;

class Outer {
    int[] nums;

    Outer(int[] n) {
        nums = n;
    }


    void Analyze() {
        Inner inOb = new Inner();

        System.out.println("Minimum: " + inOb.min());
        System.out.println("Maximum: " + inOb.max());
        System.out.println("Average: " + inOb.avg());
    }

    // Our inner class
    private class Inner {

        int min() {
            int m = nums[0];

            for (int i = 1; i < nums.length; i++) {
                if (nums[i] < m) {
                    m = nums[i];
                }
            }
            return m;
        }

        int max() {
            int max = nums[0];

            for (int i = 1; i < nums.length; i++) {
                if (nums[i] > max) {
                    max = nums[i];
                }
            }
            return max;
        }

        int avg() {
            int av = 0;
            for (int i = 0; i < nums.length; i++) {
                av += nums[i];
            }
            return av / nums.length;
        }
    }
}