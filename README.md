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
10:07:51 [INFO ] c.w.concord.plugins.git.GitTask - Cloning https://github.com/ibodrov/testcontainers-example.git to /tmp/prefork8649874655581242949/payload/repo...

```