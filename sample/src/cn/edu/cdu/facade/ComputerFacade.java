package cn.edu.cdu.facade;

class ComputerFacade {
    public static String BOOT_SECTOR = "c://windows/system32";
    public int BOOT_ADDRESS = 0x2016;
    public int SECTOR_SIZE = 0x1024;
    private CPU processor;
    private Memory ram;
    private HardDrive hd;

    /**
     * 初始化电脑，这里是组合关系
     */
    public ComputerFacade() {
        this.processor = new CPU();
        this.ram = new Memory();
        this.hd = new HardDrive();
    }

    public void start() {
        processor.freeze();
        boolean res = ram.load(BOOT_ADDRESS, hd.read(BOOT_SECTOR, SECTOR_SIZE));
        if (!res) {
            System.err.println("has error");
            System.exit(-1);
        }
        processor.jump(BOOT_ADDRESS);
        processor.execute();
    }
}
