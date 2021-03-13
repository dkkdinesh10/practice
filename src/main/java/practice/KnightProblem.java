package practice;

import java.util.ArrayDeque;
import java.util.HashSet;
import java.util.Queue;
import java.util.Set;

class Nodee {
    int x, y, dist;
    public Nodee(int x, int y, int dist) {
        this.x = x;
        this.y = y;
        this.dist = dist;
    }
}

public class KnightProblem {
    private static int[] row = { 2, 2, -2, -2, 1, 1, -1, -1 };
    private static int[] col = { -1, 1, 1, -1, 2, -2, 2, -2 };

    public static boolean valid(int x,int y){
        if(x>=8 || y>=8 || x<0 || y<0){
            return false;
        }
        return true;
    }

    public static void main(String[] args)
    {
        int N = 8;
        // source coordinates
        Nodee src = new Nodee(0, 7,0);
        // destination coordinates
        Nodee dest = new Nodee(7, 0,0);
        Nodee nnnn=findMoves(src, dest, N);
        System.out.println("Minimum number of steps required is " +nnnn.dist);
    }
    public static Nodee findMoves(Nodee src, Nodee dest, int n){
        Queue<Nodee> queue=new ArrayDeque<Nodee>();
        Set<Nodee> visited=new HashSet<Nodee>();
        queue.add(src);
        while(!queue.isEmpty()){
            Nodee node=queue.poll();
            System.out.println("-----" +node.dist);
            if(node.x==dest.x && node.y==dest.y){
                return node;
            }
            if(!visited.contains(node)){
                for(int i=0;i<8;i++){
                    int a=row[i]+node.x;
                    int b=col[i]+node.y;

                    if(valid(a,b)){
                       Nodee nn=new Nodee(a,b,node.dist+1);
                        queue.add(nn);
                    }
                }
            }
        }

        return null;
    }

}
