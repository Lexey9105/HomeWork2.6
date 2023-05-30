import java.util.*;

public class Main {
    private static final List<Integer> nums = new ArrayList<>(List.of(1, 1, 2, 3, 4, 4, 5, 5, 6, 7));
    private static final List<String> oopLanguage=new ArrayList<>(List.of("Java","Python","C++","C++","Java","Python","Python","Java"));
    public static void main(String[] args) {
task1( nums);
task2( nums);
task3( oopLanguage);
task4( oopLanguage);


    }
    public static void task1(List<Integer> nums){
        for (int num:nums) {
            if (num%2!=0){
                System.out.println(num);}
            }
        }

    public static void task2(List<Integer> nums){
        nums=new ArrayList<>(new HashSet<>(nums));
    Collections.sort(nums);
    for (int num:nums) {
        if (num%2==0){
            System.out.println(num);}
    }
}

    public static void task3(List<String> oopLanguage){
        Set<String> oopLanguageSet=new HashSet<>(oopLanguage);
        System.out.println(oopLanguageSet);
    }
    public static void task4(List<String> oopLanguage){
        Map<String,Integer>oopLanguageMap=new HashMap<>();
        for (String Language:oopLanguage) {
            if(oopLanguageMap.containsKey(Language)){
int languageCount=oopLanguageMap.get(Language)+1;
                oopLanguageMap.put(Language,languageCount);
            }else{
                oopLanguageMap.put(Language,1);
            }
        }
        System.out.println(oopLanguageMap);
    }

}


