package cn.edu.cdu.behavioral.command;

public interface FileSystemReceiver {
    void openFile();

    void writeFile();

    void closeFile();
}