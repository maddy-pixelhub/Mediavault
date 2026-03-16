package app;
import java.util.Scanner;
import model.*;
import service.*;
import util.CircularBuffer;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        UserService userService = new UserService(20);

        ContentService contentService = new ContentService(20);
        contentService.loadPredefinedContent();

        IssueService issueService = new IssueService(20);

        NavigationService navigationService = new NavigationService();

        PlaylistService playlistService = new PlaylistService();

        StreamingService streamingService = new StreamingService();

        WatchHistoryService watchHistoryService = new WatchHistoryService();

        CircularBuffer circularBuffer = new CircularBuffer(5);
        ProgressService progressService = new ProgressService(20);



        int choice;



        do {

            System.out.println("\n===== MediaVault Menu =====");

            System.out.println("1. Add User");

            System.out.println("2. Display All Users");

            System.out.println("3. Add Content");

            System.out.println("4. Display All Content");

            System.out.println("5. Sort Content by Views");

            System.out.println("6. Add to Watch History");

            System.out.println("7. Display Watch History");

            System.out.println("8. Visit Page");

            System.out.println("9. Show Navigation History");

            System.out.println("10. Go Back");

            System.out.println("11. Add Playlist Edit");

            System.out.println("12. Undo Playlist Edit");

            System.out.println("13. Add Streaming Request");

            System.out.println("14. Process Streaming Request");

            System.out.println("15. Add Issue");

            System.out.println("16. Display All Issues");

            System.out.println("17. Update Issue Status");

            System.out.println("18. Add to Circular Buffer");

            System.out.println("19. Show Circular Buffer");

            System.out.println("21. Add Progress");

            System.out.println("22. Display All Progress");

            System.out.println("23. Update Watched Duration");



            System.out.println("0. Exit");

            System.out.print("Enter your choice: ");

            choice = sc.nextInt();

            sc.nextLine();



            switch (choice) {

                case 1:

                    System.out.print("Enter User ID: ");

                    String userId = sc.nextLine();

                    System.out.print("Enter Name: ");

                    String userName = sc.nextLine();

                    System.out.print("Enter Email: ");

                    String email = sc.nextLine();

                    System.out.print("Enter Subscription Type: ");

                    String subscription = sc.nextLine();



                    User user = new User(userId, userName, email, subscription);

                    userService.addUser(user);

                    break;



                case 2:

                    userService.displayAllUsers();

                    break;



                case 3:

                    System.out.print("Enter Content ID: ");

                    String contentId = sc.nextLine();

                    System.out.print("Enter Title: ");

                    String title = sc.nextLine();

                    System.out.print("Enter Type (Movie/Series): ");

                    String type = sc.nextLine();

                    System.out.print("Enter Genre: ");

                    String genre = sc.nextLine();

                    System.out.print("Enter Rating: ");

                    double rating = sc.nextDouble();

                    System.out.print("Enter Views: ");

                    int views = sc.nextInt();

                    sc.nextLine();



                    Content content = new Content(contentId, title, type, genre, rating, views);

                    contentService.addContent(content);

                    break;



                case 4:

                    contentService.displayAllContent();

                    break;



                case 5:

                    contentService.sortByViews();

                    System.out.println("Content sorted by views.");

                    break;



                case 6:

                    System.out.print("Enter Content Title to Add in Watch History: ");

                    String watchedTitle = sc.nextLine();

                    watchHistoryService.addToHistory(watchedTitle);

                    break;



                case 7:

                    watchHistoryService.displayWatchHistory();

                    break;



                case 8:
                    System.out.print("Enter Page Name: ");
                    String page = sc.nextLine();
                    navigationService.visitPage(page);
                    break;


                case 9:

                    navigationService.displayHistory();

                    break;



                case 10:

                    navigationService.goBack();

                    break;



                case 11:

                    System.out.print("Enter Playlist Edit Action: ");

                    String action = sc.nextLine();

                    playlistService.addEdit(action);

                    break;



                case 12:

                    playlistService.undoLastEdit();

                    break;



                case 13:

                    System.out.print("Enter Request ID: ");

                    String requestId = sc.nextLine();

                    System.out.print("Enter User ID: ");

                    String reqUserId = sc.nextLine();

                    System.out.print("Enter Content ID: ");

                    String reqContentId = sc.nextLine();

                    System.out.print("Enter Subscription Type (Premium/Basic): ");

                    String reqSubscription = sc.nextLine();



                    StreamingRequest request = new StreamingRequest(requestId, reqUserId, reqContentId, reqSubscription);

                    streamingService.addRequest(request);

                    break;



                case 14:

                    streamingService.processRequest();

                    break;



                case 15:

                    System.out.print("Enter Issue ID: ");

                    String issueId = sc.nextLine();

                    System.out.print("Enter User ID: ");

                    String issueUserId = sc.nextLine();

                    System.out.print("Enter Issue Description: ");

                    String description = sc.nextLine();

                    System.out.print("Enter Issue Status: ");

                    String status = sc.nextLine();



                    Issue issue = new Issue(issueId, issueUserId, description, status);

                    issueService.addIssue(issue);

                    break;



                case 16:

                    issueService.displayAllIssues();

                    break;



                case 17:

                    System.out.print("Enter Issue ID to Update: ");

                    String updateIssueId = sc.nextLine();

                    System.out.print("Enter New Status: ");

                    String newStatus = sc.nextLine();

                    issueService.updateIssueStatus(updateIssueId, newStatus);

                    break;



                case 18:

                    System.out.print("Enter Frame/Content to Add to Buffer: ");

                    String frame = sc.nextLine();

                    circularBuffer.addToBuffer(frame);

                    break;



                case 19:

                    circularBuffer.showBuffer();

                    break;

                case 21:

                    System.out.print("Enter Content ID: ");
                    String progressContentId = sc.nextLine();
                    System.out.print("Enter Title: ");
                    String progressTitle = sc.nextLine();
                    System.out.print("Enter Total Duration (in mins): ");
                    int totalDuration = sc.nextInt();
                    System.out.print("Enter Watched Duration (in mins): ");
                    int watchedDuration = sc.nextInt();
                    sc.nextLine();

                    Progress progress = new Progress(progressContentId, progressTitle, totalDuration, watchedDuration);
                    progressService.addProgress(progress);
                    break;

                case 22:
                    progressService.displayAllProgress();
                    break;

                case 23:
                    System.out.print("Enter Content ID: ");
                    String updateContentId = sc.nextLine();
                    System.out.print("Enter New Watched Duration: ");
                    int newWatchedDuration = sc.nextInt();
                    sc.nextLine();

                    progressService.updateWatchedDuration(updateContentId, newWatchedDuration);
                    break;




                case 0:

                    System.out.println("Exiting MediaVault System...");

                    break;



                default:

                    System.out.println("Invalid choice. Please try again.");

            }



        } while (choice != 0);



        sc.close();

    }

}
