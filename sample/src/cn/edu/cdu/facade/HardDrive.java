package cn.edu.cdu.facade;

import java.util.Random;

class HardDrive {
    public boolean read(String BOOT_SECTOR, int size) {
        Random random = new Random();
        int nextInt = random.nextInt(5);
        System.out.println("read the HD " + BOOT_SECTOR + " and read size are " + size);
        return nextInt > 3 ? true : false;
    }
}