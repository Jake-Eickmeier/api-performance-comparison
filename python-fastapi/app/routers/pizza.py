from fastapi import APIRouter

router = APIRouter(prefix="/pizza", tags=["Pizza"])


@router.get("/pepperoni")
async def getPepperoniPizza():
    return {"pizza": "pepperoni"}