import java.io.*;
import java.util.*;
class Royandtrendingtopics {
    public static void main(String args[] ) throws Exception {
        int n,id,z,p,l,c,s,in1=0,in2,cz;
				
				TreeMap<Integer,Integer> tm=new TreeMap<Integer,Integer>();
				TreeMap<Integer,Integer> mt=new TreeMap<Integer,Integer>();
				ArrayList<Integer> la=new ArrayList<Integer>();
				BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
				n=Integer.parseInt(br.readLine());
				for(int j=0;j<n;j++)
				{
					StringBuffer sb=new StringBuffer(br.readLine());
					ArrayList<Integer> al=new ArrayList<Integer>();
					for(int k=0;k<5;k++)
						{
							
							in2=sb.indexOf(" ");
							al.add(Integer.parseInt(sb.substring(in1,in2)));
							sb.deleteCharAt(in2);
							in1=in2;
					
	
						}
						al.add(Integer.parseInt(sb.substring(in1,sb.length())));
					z=al.get(1);
					p=al.get(2);
					l=al.get(3);
					c=al.get(4);
					s=al.get(5);
					cz=(p*50)+(l*5)+(c*10)+(s*20);
					tm.put(new Integer(al.get(0)),new Integer(cz));
					mt.put(new Integer(al.get(0)),new Integer((cz-z)));
					in1=0;
					la.add((cz-z));
				}
				Set<Integer> hs=new HashSet<>();
				hs.addAll(la);
				la.clear();
				la.addAll(hs);
				Collections.sort(la, Collections.reverseOrder());
				int i=0;
				int val;
				ArrayList<Integer> lol=new ArrayList<Integer>();
				do
				{
					val=la.get(i);
					ArrayList<Integer> all=new ArrayList<Integer>();
					Set<Map.Entry<Integer,Integer>> st=mt.entrySet();
				for(Map.Entry<Integer,Integer> ss : st)
				{
					int key=ss.getKey();
					int value=ss.getValue();
						if(value==val)
						{
							all.add(key);
						}
				}
				Collections.sort(all, Collections.reverseOrder());
				i++;
				lol.addAll(all);
				}while(i<la.size());
					for(int za=0;za<5;za++)
					{	
						int ia=lol.get(za);
						System.out.println(ia+" "+tm.get(ia));
					}
    }
}
