# 🚀 Java Login Application with Automated CI/CD Pipeline

![Java](https://img.shields.io/badge/Java-17-orange)
![Jenkins](https://img.shields.io/badge/Jenkins-CI%2FCD-red)
![Tomcat](https://img.shields.io/badge/Tomcat-9-yellow)
![MySQL](https://img.shields.io/badge/MySQL-Database-blue)
![Nginx](https://img.shields.io/badge/Nginx-Load%20Balancer-green)

---

## 📌 Project Overview

This project demonstrates a complete DevOps workflow for deploying a Java Login Application using:

✅ Jenkins CI/CD Pipeline
✅ GitHub Integration
✅ Apache Tomcat Application Servers
✅ Nginx Load Balancer
✅ MySQL Database Server

Whenever code is pushed to GitHub, Jenkins automatically builds and deploys the application to multiple Tomcat servers.

---

## 🏗️ Architecture

```text
Developer
    │
    ▼
 GitHub Repository
    │
    ▼
 Jenkins CI/CD
    │
 ┌──┴──┐
 ▼     ▼
App1  App2
Tomcat Tomcat
   \   /
    \ /
  Nginx
 Load Balancer
      │
      ▼
   End Users

      │
      ▼
    MySQL
 Database
```

---

## 🖥️ Infrastructure

| VM            | Purpose          |
| ------------- | ---------------- |
| 🌐 Nginx VM   | Load Balancer    |
| 🚀 App1 VM    | Tomcat Server    |
| 🚀 App2 VM    | Tomcat Server    |
| 🗄️ MySQL VM  | Database         |
| ⚙️ Jenkins VM | CI/CD Automation |

---

## 🔄 CI/CD Workflow

```text
Code Change
    ↓
Git Push
    ↓
GitHub
    ↓
Jenkins Trigger
    ↓
Maven Build
    ↓
WAR Creation
    ↓
Deploy App1
    ↓
Deploy App2
    ↓
Application Updated
```

---

## 📸 Project Screenshots

### Infrastructure Setup
<img width="1426" height="759" alt="INFRA" src="https://github.com/user-attachments/assets/90adf9ba-5330-4600-8339-b11e003af16b" />


### Git Push

<img width="656" height="418" alt="image" src="https://github.com/user-attachments/assets/a30069e7-3428-4b0a-85e7-aa8699596dda" />


### Automatic Deployment

<img width="602" height="582" alt="image" src="https://github.com/user-attachments/assets/18eaf6f6-fd02-4884-bf3a-fc82bd14213f" />


### Jenkins Build Success

<img width="743" height="685" alt="image" src="https://github.com/user-attachments/assets/a3b4f3f3-6141-4e9e-88b0-9c89f35bef69" />



### Final Output

<img width="506" height="396" alt="image" src="https://github.com/user-attachments/assets/16ee6436-097a-4bfb-a713-d5f670668ca0" />


---

## 🎯 Key Features

* Multi-VM Architecture
* Nginx Load Balancing
* MySQL Integration
* Automated CI/CD Pipeline
* GitHub Webhook Trigger
* Maven Build Automation
* Tomcat Deployment
* Zero Manual Deployment

---

## 🧠 Skills Demonstrated

* Linux Administration
* Networking
* Port Forwarding
* Apache Tomcat
* MySQL
* Jenkins
* Git & GitHub
* Maven
* Nginx
* DevOps Fundamentals

---

## 👨‍💻 Author

**Chand Parveen**

B.Tech CSE | DevOps & Cloud Computing Project

