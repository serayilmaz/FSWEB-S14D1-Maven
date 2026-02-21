package com.workintech.developers;

public class HRManager extends Employee {

    // 3 adet instance variable: 3 ayrı dizi
    private JuniorDeveloper[] juniorDevelopers;
    private MidDeveloper[] midDevelopers;
    private SeniorDeveloper[] seniorDevelopers;

    public HRManager(int id, String name, double salary) {
        super(id, name, salary);
        // default kapasite: istersen testte istenen boyuta göre değiştirebilirsin
        this.juniorDevelopers = new JuniorDeveloper[10];
        this.midDevelopers = new MidDeveloper[10];
        this.seniorDevelopers = new SeniorDeveloper[10];
    }

    // İstersen kapasiteyi dışarıdan da aldır (gerekirse)
    public HRManager(int id, String name, double salary, int juniorSize, int midSize, int seniorSize) {
        super(id, name, salary);
        this.juniorDevelopers = new JuniorDeveloper[Math.max(0, juniorSize)];
        this.midDevelopers = new MidDeveloper[Math.max(0, midSize)];
        this.seniorDevelopers = new SeniorDeveloper[Math.max(0, seniorSize)];
    }

    @Override
    public void work() {
        System.out.println("HRManager starts to working");
        setSalary(getSalary() + 1500);
    }

    // Overload: Junior
    public void addEmployee(JuniorDeveloper developer, int index) {
        if (index < 0 || index >= juniorDevelopers.length) {
            System.out.println("Invalid index for juniorDevelopers: " + index);
            return;
        }
        if (juniorDevelopers[index] != null) {
            System.out.println("Index " + index + " is already occupied in juniorDevelopers.");
            return;
        }
        juniorDevelopers[index] = developer;
        System.out.println("JuniorDeveloper added to juniorDevelopers at index " + index);
    }

    // Overload: Mid
    public void addEmployee(MidDeveloper developer, int index) {
        if (index < 0 || index >= midDevelopers.length) {
            System.out.println("Invalid index for midDevelopers: " + index);
            return;
        }
        if (midDevelopers[index] != null) {
            System.out.println("Index " + index + " is already occupied in midDevelopers.");
            return;
        }
        midDevelopers[index] = developer;
        System.out.println("MidDeveloper added to midDevelopers at index " + index);
    }

    // Overload: Senior
    public void addEmployee(SeniorDeveloper developer, int index) {
        if (index < 0 || index >= seniorDevelopers.length) {
            System.out.println("Invalid index for seniorDevelopers: " + index);
            return;
        }
        if (seniorDevelopers[index] != null) {
            System.out.println("Index " + index + " is already occupied in seniorDevelopers.");
            return;
        }
        seniorDevelopers[index] = developer;
        System.out.println("SeniorDeveloper added to seniorDevelopers at index " + index);
    }

    // (Opsiyonel) Getter’lar test isterse diye
    public JuniorDeveloper[] getJuniorDevelopers() { return juniorDevelopers; }
    public MidDeveloper[] getMidDevelopers() { return midDevelopers; }
    public SeniorDeveloper[] getSeniorDevelopers() { return seniorDevelopers; }
}