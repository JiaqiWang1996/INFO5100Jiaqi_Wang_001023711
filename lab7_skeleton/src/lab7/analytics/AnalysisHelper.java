/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab7.analytics;

/**
 *
 * @author harshalneelkamal
 */

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import lab7.entities.Comment;
import lab7.entities.Post;
import lab7.entities.User;
import sun.security.x509.KeyUsageExtension;


public class AnalysisHelper {
    //Find Average number of likes per comment.
    //TODO
    public void getAverageLikesPerCommets() {
        Map<Integer, Comment> comments = DataStore.getInstance().getComments();
        int likeNumber = 0;
        int commentNumber = comments.size();
        for (Comment c : comments.values()) {
            likeNumber += c.getLikes();
        }
        
        System.out.println("average of likes per comments: " + likeNumber / commentNumber);
            
    }
    public void getpostWithMostLikedComments(){
      Map<Integer, Comment> comments = DataStore.getInstance().getComments();
      Comment comment1=null;
      for(Entry<Integer,Comment>entry:comments.entrySet()){
      comment1=entry.getValue();
          if (comment1!=null) {
              break;
          }
      }//to get the first instance of comment
      int mostliked_key = 0;//initialize
      for(Integer key:comments.keySet()){
          if (comments.get(key).getLikes()>comment1.getLikes()) {
              mostliked_key=key;
          }
      }
          
       System.out.println("Find the post with most liked comments."+comments.get(mostliked_key).getPostId());
    } 
    
    public void getpostWithMostComments(){
    Map<Integer, Post>posts= DataStore.getInstance().getPosts();
   Post post1=null;
   for(Entry<Integer,Post>entry:posts.entrySet()){
       post1=entry.getValue();
   if(post1!=null){
   break;
   }
   }//to get the first instance of post
   int most_key=0;//initialize
   for(Integer key:posts.keySet()){
       if (posts.get(key).getComments().size()>post1.getComments().size()) {
           most_key=key;
       }
   }
   
        System.out.println("Find the post with most comments"+posts.get(most_key).getPostId());
    }
    
    public void Find_Top_5_inactive_users_based_on_total_posts_number(){
    Map<Integer,Post>posts=DataStore.getInstance().getPosts();
       Map<Integer,Integer>postcountMap=new HashMap<Integer,Integer>();//post counter
       for(Integer key:posts.keySet()){
       if(!postcountMap.containsKey(posts.get(key).getUserId())){
       postcountMap.put(posts.get(key).getUserId(),1);
       }
       else{
       int count=postcountMap.get(posts.get(key).getUserId());
       postcountMap.put( posts.get(key).getUserId(),count+1);
       }
       } //Map<UserId,count>
        //将map.entrySet()转化为list
      List<Map.Entry<Integer,Integer>>list=new ArrayList<Map.Entry<Integer, Integer>>(postcountMap.entrySet());
      Collections.sort(list,new Comparator<Map.Entry<Integer, Integer>>(){
        @Override //sort by natural order,升序
        public int compare(Entry<Integer, Integer> t1, Entry<Integer, Integer> t2) {
            //To change body of generated methods, choose Tools | Templates.
            return  t1.getValue().compareTo(t2.getValue());
            
        }  
      } );
      
       System.out.println("Find The Top 5 inactive users based on total posts number"+list.get(0).getKey()+" "+list.get(1).getKey()+" "+list.get(2).getKey()+" "+list.get(3).getKey()+" "+list.get(4).getKey()) ;
    }
    
    public void Find_Top_5_inactive_users_based_on_total_comments_they_created(){
    
    Map<Integer,Comment>comments=DataStore.getInstance().getComments();
       Map<Integer,Integer>commentcountMap=new HashMap<Integer,Integer>();//post counter
       for(Integer key:comments.keySet()){
       if(!commentcountMap.containsKey(comments.get(key).getUserId())){
       commentcountMap.put(comments.get(key).getUserId(),1);
       }
       else{
       int count=commentcountMap.get(comments.get(key).getUserId());
       commentcountMap.put( comments.get(key).getUserId(),count+1);
       }
       } //Map<UserId,count>
        //将map.entrySet()转化为list
      List<Map.Entry<Integer,Integer>>list=new ArrayList<Map.Entry<Integer, Integer>>(commentcountMap.entrySet());
      Collections.sort(list,new Comparator<Map.Entry<Integer, Integer>>(){
        @Override //sort by natural order,升序
        public int compare(Entry<Integer, Integer> t1, Entry<Integer, Integer> t2) {
            //To change body of generated methods, choose Tools | Templates.
            return  t1.getValue().compareTo(t2.getValue());
            
        }  
      } );
      
       System.out.println("Find The Top 5 inactive users based on total comments they created"+list.get(0).getKey()+" "+list.get(1).getKey()+" "+list.get(2).getKey()+" "+list.get(3).getKey()+" "+list.get(4).getKey()) ;
    }
    
    public void Find_Top_5_inactive_users_overall__sum_of_comments_posts_and_likes(){
      Map<Integer,Comment>comments=DataStore.getInstance().getComments();
      Map<Integer,Post>posts=DataStore.getInstance().getPosts();
       Map<Integer,Integer>sumcountMap=new HashMap<Integer,Integer>();//post counter
       for(Integer key:comments.keySet()){
       if(!sumcountMap.containsKey(comments.get(key).getUserId())){
       sumcountMap.put(comments.get(key).getUserId(),1+comments.get(key).getLikes());
       }
       else{
       int count=sumcountMap.get(comments.get(key).getUserId());
       sumcountMap.put( comments.get(key).getUserId(),count+1+comments.get(key).getLikes());
       }
       }
   for(Integer key:posts.keySet()){
   if(!sumcountMap.containsKey(posts.get(key).getUserId())){
   sumcountMap.put(posts.get(key).getUserId(), 1);
   }
   else{
   int count=sumcountMap.get(posts.get(key).getUserId());
   sumcountMap.put(posts.get(key).getUserId(), count+1);
   }
   }//Map<UserId,count>
        //将map.entrySet()转化为list
      List<Map.Entry<Integer,Integer>>list=new ArrayList<Map.Entry<Integer, Integer>>(sumcountMap.entrySet());
      Collections.sort(list,new Comparator<Map.Entry<Integer, Integer>>(){
        @Override //sort by natural order,升序
        public int compare(Entry<Integer, Integer> t1, Entry<Integer, Integer> t2) {
            //To change body of generated methods, choose Tools | Templates.
            return  t1.getValue().compareTo(t2.getValue());
            
        }  
      } );
      
       System.out.println("Top 5 inactive users overall (sum of comments, posts and likes):"+list.get(0).getKey()+" "+list.get(1).getKey()+" "+list.get(2).getKey()+" "+list.get(3).getKey()+" "+list.get(4).getKey()) ;
    }
    
    public  void Find_Top_5_proactive_users_overall___sum_of_comments_posts_and_likes(){
    
     Map<Integer,Comment>comments=DataStore.getInstance().getComments();
      Map<Integer,Post>posts=DataStore.getInstance().getPosts();
       Map<Integer,Integer>sumcountMap=new HashMap<Integer,Integer>();//post counter
       for(Integer key:comments.keySet()){
       if(!sumcountMap.containsKey(comments.get(key).getUserId())){
       sumcountMap.put(comments.get(key).getUserId(),1+comments.get(key).getLikes());
       }
       else{
       int count=sumcountMap.get(comments.get(key).getUserId());
       sumcountMap.put( comments.get(key).getUserId(),count+1+comments.get(key).getLikes());
       }
       }
   for(Integer key:posts.keySet()){
   if(!sumcountMap.containsKey(posts.get(key).getUserId())){
   sumcountMap.put(posts.get(key).getUserId(), 1);
   }
   else{
   int count=sumcountMap.get(posts.get(key).getUserId());
   sumcountMap.put(posts.get(key).getUserId(), count+1);
   }
   }//Map<UserId,count>
        //将map.entrySet()转化为list
      List<Map.Entry<Integer,Integer>>list=new ArrayList<Map.Entry<Integer, Integer>>(sumcountMap.entrySet());
      Collections.sort(list,new Comparator<Map.Entry<Integer, Integer>>(){
        @Override //sort by natural order,升序
        public int compare(Entry<Integer, Integer> t1, Entry<Integer, Integer> t2) {
            //To change body of generated methods, choose Tools | Templates.
            return  t1.getValue().compareTo(t2.getValue());
            
        }  
      } .reversed());
      
       System.out.println("Top 5 proactive users overall (sum of comments, posts and likes):"+list.get(0).getKey()+" "+list.get(1).getKey()+" "+list.get(2).getKey()+" "+list.get(3).getKey()+" "+list.get(4).getKey()) ;
    }
    
    
    }
    
    
    
    

