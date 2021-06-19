public class OwnList implements IntList {

    int[] list = new int[10];
    int top = 0;

    public void add(int i) {
        if (top >= list.length) {
            int[] spareList = new int[list.length];
            spareList = list.clone();
            list = new int[top + top / 3];
            for (int j : spareList) {
                list[j] = spareList[j];
            }
            list[top] = i;
        }
    }

    @Override
    public void insert(int index, int value) {
        if(list[index] == null){

        }

    }

    @Override
    public void set(int index, int value) {

    }

    public int size() {

        return top;
    }

    @Override
    public int capacity() {

        return list.length;
    }

    @Override
    public int getByIndex(int index) {
        if (index < top) {
            return list[index];
        } else {
            return 000;
        }

    }

    @Override
    public Integer getIndexByValue(int value) {
        return null;
    }

    @Override
    public boolean contains(int value) {
        return false;
    }

    @Override
    public void removeValue(int value) {

    }

    @Override
    public void removeByIndex(int index) {

    }

    @Override
    public IntList subList(int fromIndex, int toIndex) {
        return null;
    }

    @Override
    public int[] toArray() {
        return new int[0];
    }
}
