# Agile Testing Days 2021 Gatling Workshop
Service under load test and resources for our [Gatling workshop @ Agile Testing Days 2021](https://agiletestingdays.com/2021/session/bring-out-the-big-guns-load-testing-with-gatling/).

## Installation

Make sure you have Docker (and Docker Compose) and JDK 11 installed on your system.

Run the following command:
```
./mvnw clean install
```

On Windows run the following command:

```
./mvnw.cmd clean install
```

This will build the service and install the service in your local Docker repository.

## Usage

Either start the service through Maven with the following command:

```
./mvnw spring-boot:run
```

Or run the docker container using the following command:

```
docker-compose up
```

The service will server requests at:

```
http://localhost:8080/test
```

## Contributing

1. Fork it!
2. Create your feature branch: `git checkout -b my-new-feature`
3. Commit your changes: `git commit -am 'Add some feature'`
4. Push to the branch: `git push origin my-new-feature`
5. Submit a pull request :)

## Credits

- [Andrej Thiele](https://github.com/Anthie123)
- [Lukas Pradel](https://github.com/lpradel)

## License


    Copyright 2021 Andrej Thiele, Lukas Pradel
    
    Licensed under the Apache License, Version 2.0 (the "License");
    you may not use this file except in compliance with the License.
    You may obtain a copy of the License at
    
      http://www.apache.org/licenses/LICENSE-2.0
    
    Unless required by applicable law or agreed to in writing, software
    distributed under the License is distributed on an "AS IS" BASIS,
    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    See the License for the specific language governing permissions and
    limitations under the License.
