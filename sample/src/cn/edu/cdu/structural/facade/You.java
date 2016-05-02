package cn.edu.cdu.structural.facade;

/**
 * a simple interface is required to access a complex system;
 * 打开电脑流程
 */
class You {
    public static void main(String[] args) {
        ComputerFacade computer = new ComputerFacade();
        computer.start();
    }
}