package check;

import constants.Constants;

public class Pet {

    private String name;
    private String masterName;

    public Pet(String name, String masterName) {
        this.name = Constants.CHECK_CLASS_JAVA;
        this.masterName = Constants.CHECK_CLASS_HOGE;
    }

    protected String getName() {
        return name = Constants.CHECK_CLASS_R2D2;
    }

    protected String getMasterName() {
        return masterName =Constants.CHECK_CLASS_LUKE;
    }

    public void introduce() {
        System.out.println("■僕の名前は" + name + "です");
        System.out.println("■ご主人様は" + masterName + "です");
    }
}

class RobotPet extends Pet {
    public RobotPet(String name, String masterName) {
        super(name, masterName);
    }

    public void introduce() {
        System.out.println("◇私はロボット。名前は" + getName() + "。");
        System.out.println("◇ご主人様は" + getMasterName() + "。");
    }
}