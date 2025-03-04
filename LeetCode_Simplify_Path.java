class Solution {
    public String simplifyPath(String path) {
      //T(C(N)) and S(C(N)) ==O(N) as it requires non contigous memory alloc iteratively
        Deque<String> stack = new LinkedList<>();//Dequeing LinkedList
        for (String dir : path.split("/")) {//Iterating through linked List
            if (dir.isEmpty() || dir.equals(".")) continue;//initilizing Path
            if (dir.equals("..")) {if (!stack.isEmpty()) stack.pop();}//poping up the Stack
               else {stack.push(dir);}//pushing Up the stack
        }
        StringBuilder output = new StringBuilder();//output Declare
        while (!stack.isEmpty()) {       result.insert(0, "/" + stack.pop());}//inserting in output
        return result.length() == 0 ? "/" : result.toString();//printing Output's Length
    }
    }
