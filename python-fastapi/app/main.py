from fastapi import FastAPI
from app.routers import buckets as buckets_router
from prometheus_fastapi_instrumentator import Instrumentator, metrics
from app.metrics import buckets

app = FastAPI()

instrumentator = Instrumentator().instrument(app).expose(app)
instrumentator.add(metrics.latency(buckets=buckets))

app.include_router(buckets_router.router)

@app.get("/")
async def get_root():
    return "Hello Root"


