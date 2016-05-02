package cn.edu.cdu.structural.facade;

class CPU {
    public void freeze() {
        System.out.println("the CPU freeze");
    }

    public void jump(long position) {
        System.out.println("the CPU start jump to address " + position);
    }

    public void execute() {
        System.out.println("the CPU start execute");
    }
}