1. Run the app noramlly
2. `curl http://localhost:8080/simple` - success
3. While the app is running, change the code a little
4. `curl http://localhost:8080/simple` - fails
5. `curl http://localhost:8080/simple/123/123` - fails
6. Re-run the code
7. `curl http://localhost:8080/simple` - success
8. `curl http://localhost:8080/simple/123/123` - fails
9. Change the code back
10. `curl http://localhost:8080/simple` - fails
11. `curl http://localhost:8080/simple/123/123` - fails
