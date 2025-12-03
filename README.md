# api-performance-comparison

A comparison of some core metrics for APIs built using different technologies

## How to run/use
`docker-compose up -d --build`
- You can leave out the -d flag if you don't care to run the services in detached mode
- You can leave out the --build flag if you don't need to rebuild the Docker images

With everything running, the given services will be exposed on the following ports:
- Prometheus: **9090**
- Grafana: **3000** (Username: admin  | Password: grafana)
- cadvisor: **8080**
- fastapi-application: **8000**
- java-spring-application: **8001**

The Grafana dashboard has provisioning, so simply navigate to the "FastAPI vs Spring" dashboard if desired.

There are k6 load tests for each service, found in the root directory of this project structure. They apply a virtual user (VU) load, so you will notice that these tests do not necessarily produce an even load in terms of Requests Per Second (RPS) on either service, as one may be faster at servicing a given VU, and move on to the next one.

To run both load tests simultaneously there is a script for your convenience. Make sure that k6 is installed and simply run `bash run-k6-tests.sh`

The load test will run for approximately 5 minutes.

*Note*: At time of writing, there is a bug on my machine in which container names are not visible by cAdvisor. As such, the CPU Usage queries must be re-pointed to the appropriate containers by ID after runtime. I will endeavour to solve this at a later time, but am also considering other metrics exporters and/or kubernetes so am leaving it as-is for the short term.

## Tech stack
### API
- FastAPI (Python)

- Spring web framework (Java)

### Metrics
- Prometheus: 
    - Instrumenting services for basic performance metrics
    - Server for scraping and querying exported data from services and other technologies

- cadvisor:
    - Exposing container metrics from docker

### Dashboarding/visualization
- Grafana
    - Display time-series graphs for latency percentiles, resource usage, etc.

### Containerization
- Docker


- Docker-compose

### Load testing
- k6