Thonk
=====

A Comprehensive Interactive Guide to all Scientific Knowledge

ssh access available a ubuntu@54.209.168.203
Glassfish admin user name is admin and the password
is the same as the linux user's (ubuntu) password.
The server runs all Fridays 6am to Sundays 11:59 PM.
If you need to run the server at another time message
Ben on facebook or at bhowden@razemedia.com.

Project is located at ~/Thonk (/home/ubuntu/Thonk)
to build the project run:

```bash
cd ~/Thonk
mvn install
```

editing on the server is not advised but if necessary:
```bash
git pull
git add .
git commit
git push origin master
```

If you need to reset:
```bash
git reset --hard
git clean -xdf
```



The project package file is located at:
```bash
/home/ubuntu/Thonk/target/thonk.war
```
Glassfish server files are located in:
```bash
/opt/glassfish4
```
The glassfish server is now in init.d but
to start the server manually run 
```bash
service glassfish start
```
and to stop it
```bash
service glassfish stop
```
Server admin console is located at https://54.209.168.203:4848/
for more information about using glassfish and deploying the 
application go to https://glassfish.java.net/documentation.html
