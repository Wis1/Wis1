package com.kodilla.testing.forum.statistics;

import java.util.List;

public class CountStatistics {
    private int averagePostsPerUser;
    private int averageCommentsPerUser;
    private int averageCommentsPerPost;

    public int getAveragePostsPerUser() {
        return averagePostsPerUser;
    }

    public int getAverageCommentsPerUser() {
        return averageCommentsPerUser;
    }

    public int getAverageCommentsPerPost() {
        return averageCommentsPerPost;
    }

    public Statistics calculateAdvStatistics(Statistics statistics){
        List<String> listOfUsers=statistics.usersNames();
        int numberOfPosts= statistics.postsCount();
        int numberOfComments= statistics.commentsCount();

        if (listOfUsers.size()>0){
            this.averagePostsPerUser=numberOfPosts/listOfUsers.size();
            averageCommentsPerUser= numberOfComments/listOfUsers.size();
        } else
            System.out.println("No users");

        if(numberOfPosts>0)
            averageCommentsPerPost= numberOfComments/numberOfPosts;
        else
            System.out.println("No posts");

        return statistics;
    }
}
