package com.kodilla.testing.forum.statistics;

import java.util.List;

public class CountStatistics {
    private Statistics statistics;
    private int averagePostsPerUser;
    private int averageCommentsPerUser;
    private int averageCommentsPerPost;

    public CountStatistics(int averagePostsPerUser, int averageCommentsPerUser, int averageCommentsPerPost) {
        this.averagePostsPerUser = averagePostsPerUser;
        this.averageCommentsPerUser = averageCommentsPerUser;
        this.averageCommentsPerPost = averageCommentsPerPost;
    }

    public CountStatistics(Statistics statistics) {
        this.statistics = statistics;
    }

    public Statistics calculateAdvStatistics(Statistics statistics){
        List<String> listOfUsers=statistics.usersNames();
        int numberOfPosts= statistics.postsCount();
        int numberOfComments= statistics.commentsCount();
        if (listOfUsers.size()>0){
            this.averagePostsPerUser=numberOfPosts/listOfUsers.size();
            averageCommentsPerUser= numberOfComments/listOfUsers.size();
                if(numberOfPosts>0)
                    averageCommentsPerPost= numberOfComments/numberOfPosts;
                else
                    System.out.println("No posts");}
        else
            System.out.println("No users");



        return statistics;
    }
}
