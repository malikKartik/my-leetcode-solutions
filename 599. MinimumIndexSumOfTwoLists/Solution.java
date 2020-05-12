class Solution {
    public String[] findRestaurant(String[] list1, String[] list2) {
        Map<String,Integer> map2= new HashMap<>();
        for(int i = 0;i<list2.length;i++){
            map2.put(list2[i],i);
        }
        int min = Integer.MAX_VALUE;
        List<String> list = new ArrayList<>();
        for(int i = 0;i<list1.length;i++){
            if(map2.containsKey(list1[i])){
                if(i+map2.get(list1[i])<=min){
                    min = i+map2.get(list1[i]);
                    list.add(list1[i]);
                }
            }
        }
        return list.toArray(new String[list.size()]);
    }
}