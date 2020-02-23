

package com.company;

import java.util.List;

public class Main {
    private static RecordDAO records = new RecordDAO();

    public static void main(String[] args) {
        for (; ; ) {
            String cmd = Asker.askString("command");
            switch (cmd) {
                case "exit":
                    System.out.println("Goodbye");
                    return;
                case "info":
                case "help":
                    showHelp();
                    break;
                case "create":
                    createRecord();
                    break;
                case "list":
                    listRecord();
                    break;
                case "delete user":
                    deleteRecord();
                    break;

                default:
                    System.out.println("Wrong command");
            }
        }
    }

    private static void deleteRecord() {
        int id = Asker.askId();
        records.remove(id);
    }

    private static void listRecord() {
        List<Record> all = records.getAllRecords();
        for (var r : all) {
            System.out.println(r);
        }
    }

    private static void createRecord() {
        var r = new Record();
        r.askInfo();
        records.add(r);
    }

    private static void showHelp() {
        System.out.println("This is very helpfull information.");
    }
}

