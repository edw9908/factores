public class factor {
    public static int getIndex(int[] card, int[][] vals, int[] dist, int perm, int ini, int sup){
        if(ini == -1){
            return sup;
        }
        int busc = dist[ini];
        int t = 0;
        for(int i = 0; i < vals[ini].length; i++){
            if(vals[ini][i] == busc){
                t = i;
                break;
            }
        }
        int mult = 1;
        for(int i = ini; i < dist.length; i++){
            mult*=card[i];
        }
        int rang = perm/mult;
        int lim_sup = (rang*t)+sup;
        return getIndex(card,vals,dist,perm,ini-1,lim_sup);
    }

    public static void main(String[] args) {
        int[] card = {2,2,3};
        int[][] vals= {{0,2},{3,5},{1,2,5}};
        int[] dist= {2,5,5};
        System.out.println(getIndex(card,vals,dist,12,2,0));
    }
}
