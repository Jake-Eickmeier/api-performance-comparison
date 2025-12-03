from fastapi import APIRouter
from app.metrics import buckets

router = APIRouter(prefix="/buckets", tags=["Buckets"])


@router.get("")
async def get_buckets():
    return {"buckets": buckets}