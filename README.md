# Testcontainers in Concord

## Running

- check the `DOCKER_HOST` value in `maven.yml`. Depending on your environment DIND might be
listening on a different port.

- start the process:
  ```
  curl -ikn -F settings.xml=@settings.xml -F concord.yml=@maven.yml http://localhost:8001/api/v1/process
  ```

## Example Output

```
10:13:53 [INFO ] c.w.concord.plugins.git.GitTask - Cloning https://github.com/ibodrov/testcontainers-example.git to /tmp/prefork6351889922446449285/payload/repo...
...
10:13:55 DOCKER: 3: Pulling from library/maven
10:13:56 DOCKER: Digest: sha256:492b3b5898fefde308380896b0195c7879b4cf052461599be5d6811c2f3ccd57
...
10:14:37 DOCKER: 15:14:37.169 [main] [INFO ] 🐳 [redis:5.0.3-alpine] - Starting container with ID: 6f15d59096a0b4078e8b67c64dc9807cf9808634bc89629258e7ffa7a16efd7e
10:14:37 DOCKER: 15:14:37.425 [main] [INFO ] 🐳 [redis:5.0.3-alpine] - Container redis:5.0.3-alpine is starting: 6f15d59096a0b4078e8b67c64dc9807cf9808634bc89629258e7ffa7a16efd7e
10:14:37 DOCKER: 15:14:37.563 [main] [INFO ] 🐳 [redis:5.0.3-alpine] - Container redis:5.0.3-alpine started in PT7.867084S
10:14:37 DOCKER: !!! localhost:32770
...
```
