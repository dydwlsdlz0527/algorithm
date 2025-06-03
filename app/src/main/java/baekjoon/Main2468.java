package baekjoon;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main2468 {

    static int[] nextx = {1,-1,0,0};
    static int[] nexty = {0,0,1,-1};
    static int[][] arr = null;
    static boolean[][] chk = null;
    static Queue<Point> que = new LinkedList<>();

    public static int search(int n, int size){
        int safearea = 0;
        int posx = 0;
        int posy = 0;
        for(int i=0;i<size;i++){
            for(int j=0;j<size;j++){
                if(arr[i][j]>n&&chk[i][j]==false){
                    que.add(new Point(i,j));
                    chk[i][j] = true;
                    while(!que.isEmpty()){
                        Point p = que.poll();
                        for(int k=0;k<4;k++){
                            posx = p.x + nextx[k];
                            posy = p.y + nexty[k];
                            if(posx<0||posy<0||posx>=size||posy>=size){
                                continue;
                            }
                            if(arr[posx][posy]>n&&chk[posx][posy]==false){
                                que.add(new Point(posx,posy));
                                chk[posx][posy]=true;
                            }
                        }
                    }
                    safearea ++;
                }
            }
        }
        return safearea;
    }

    public static int maxheight(int temp, int a){
        return (temp>a)?temp:a;
    }

    public static int maxsafe(int temp2, int cnt){
        return (temp2>cnt)?temp2:cnt;
    }

    public static void main(String[] args) {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer stringTokenizer;
        try{
            int N = Integer.parseInt(bufferedReader.readLine());
            arr = new int[N][N];
            chk = new boolean[N][N];
            int rain = 0;
            for (int i = 0; i < N; i++) {
                stringTokenizer = new StringTokenizer(bufferedReader.readLine(), " ");
                for (int j = 0; j < N; j++) {
                    arr[i][j] = Integer.parseInt(stringTokenizer.nextToken());
                    rain = maxheight(rain, arr[i][j]);
                }
            }
            int temp = 0;
            for (int i = rain-1; i >= 0; i--) {
                for(boolean[] a:chk){
                    Arrays.fill(a,false);
                }
                temp = maxsafe(temp,search(i,N));
            }
            bufferedWriter.write(String.valueOf(temp));
        }catch(Exception e){
            e.printStackTrace();
        }finally {
            try{
                bufferedReader.close();
                bufferedWriter.close();
            }catch (Exception e1){
                e1.printStackTrace();
            }
        }
    }
}
class Point{
    int x;
    int y;
    public Point(int n, int m){
        this.x = n;
        this.y = m;
    }
}