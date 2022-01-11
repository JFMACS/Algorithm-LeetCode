class TwoSum {

    private List<Integer> numbers;
    private HashMap<Integer, Boolean> flag;
    
    public TwoSum() {
        numbers = new ArrayList<>();
        flag = new HashMap<Integer, Boolean>();
    }
    
    public void add(int number) {
        for (Integer num: numbers) {
            flag.put((num + number), true);
        }
        numbers.add(number);
    }
    
    public boolean find(int value) {
        if(flag.containsKey(value)) {
            return true;
        }
        return false;
    }
}