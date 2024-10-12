# Chat Application

A client-server based chat application developed in Java, allowing users to communicate in real time, share pictures, and transfer all file types. This project also incorporates message storage using MS SQL Server, making it a robust and scalable solution for instant messaging.

# Features

-Real-time Messaging: Exchange messages in real time with other connected users.

-File Sharing: Send and receive all types of files, including text documents, PDFs, and more.

-Image Sharing: Share and view images directly within the chat window.

-Message Storage: Messages are stored using MS SQL Server for long-term retention and easy retrieval.

-File Storage: Received files are saved on the recipient's device for offline access.

# Technologies Used

-Java: Core development language for building the client and server applications.

-Socket Programming: Used for real-time client-server communication.

-MS SQL Server: Database integration for storing chat history and managing user data.

-Java Swing: For the graphical user interface (GUI).

# Installation and Setup 
## Prerequisites

-Java 8 or above

-MS SQL Server
## Steps to Run
Clone the repository:

bash

Copy code

git clone [https://github.com/Ahmed-Hesham-F5/Chat-Application.git](https://github.com/Ahmed-Hesham-F5/Chat-Application.git)

Import the project into your preferred IDE (e.g., NetBeans, IntelliJ).

Set up the MS SQL Server:

Create a new database for message storage.

Update the database connection details in the Server class.

Run the Server application first:

This will initialize the server and start listening for client connections.

Run the Client application:

Multiple clients can connect to the server and begin chatting in real time.

## Usage
-Sending Messages: Type your message in the chat box and press "Send" to deliver it to other users.

-File Sharing: Click on the file icon to choose and send a file. It will be saved on the recipient’s device.

-Image Sharing: Images are displayed directly within the chat window.

# Future Improvements
-Group Chat: Implement group chat functionality to support multiple users in a single conversation.

-Encryption: Add message encryption for secure communication.

-Video and Voice Calls: Integrate real-time video and voice calling features.
