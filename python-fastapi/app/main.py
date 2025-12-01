from fastapi import FastAPI
from app.routers import pizza
from prometheus_fastapi_instrumentator import Instrumentator, metrics
from app.metrics import buckets

app = FastAPI()

instrumentator = Instrumentator().instrument(app).expose(app)
instrumentator.add(metrics.latency(buckets=buckets))

app.include_router(pizza.router)

@app.get("/")
async def get_root():
    return "Hello Root"

@app.get("/buckets")
async def get_buckets():
    return {"buckets": buckets}

