public class Experiment {
    String testSubject;
    int unrelatedNum;

    public static void main(String[] args) {
        Experiment frankensteinsMonster = new Experiment();

        frankensteinsMonster.testSubject = "Abbey Normal";

        System.out.println(frankensteinsMonster.testSubject.length());
        System.out.println(frankensteinsMonster.testSubject.charAt(1));
        System.out.println(frankensteinsMonster.testSubject.replace('e', '-'));
        System.out.println(frankensteinsMonster.testSubject.toUpperCase());
        System.out.println(frankensteinsMonster.testSubject.concat("? YOU PUT AN ABNORMAL BRAIN IN MY CREATURE?!"));

        frankensteinsMonster.unrelatedNum = 1974;

        System.out.println(Math.pow(frankensteinsMonster.unrelatedNum, 2));
        System.out.println(Math.sqrt(frankensteinsMonster.unrelatedNum));
        System.out.println(Math.random() * 10);
    }
}
