package cn.edu.cdu.facade;

class Memory {
    public boolean load(long position, boolean res) {
        System.out.println("load the address is " + position + " is success ?" + res);
        return res;
    }
}