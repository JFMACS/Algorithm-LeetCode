class Solution {
    public boolean canVisitAllRooms(List<List<Integer>> rooms) {
        // 当房间数为 0 或者只能进入房间 0 时返回false
        if(rooms.size() == 0 || (rooms.size() > 1 && rooms.get(0).size() == 0)) {
            return false;
        }
        boolean canVisitAllRooms = true;
        // 记录当前进入房间所拥有的钥匙
        Queue<Integer> currentRooms = new LinkedList<>();
        // 记录已经进入的房间
        Map<Integer, Boolean> isEntered = new HashMap<>();
        // 记录进入房间个数
        int countEnterRoom = 0;
        // 将 0 号房间的钥匙加入队列
        currentRooms.addAll(rooms.get(0));
        isEntered.put(0, true);
        countEnterRoom ++;
        while (!currentRooms.isEmpty()) {
            // 当前队列长度
            int count = currentRooms.size();
            int currentRoom;
            for (int i = 0; i < count; i++) {
                currentRoom = currentRooms.poll();
                // 若当前房间未进入过 则将当前房间拥有的房间钥匙添加进队列
                if(!isEntered.containsKey(currentRoom)) {
                    currentRooms.addAll(rooms.get(currentRoom));
                    isEntered.put(currentRoom, true);
                    countEnterRoom ++;
                }
            }
        }
        if(countEnterRoom < rooms.size()) {
            canVisitAllRooms = false;
        }
        return canVisitAllRooms;
    }
}