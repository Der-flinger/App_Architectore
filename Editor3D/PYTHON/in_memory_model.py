

from abc import ABC, abstractmethod
from ast import List


class IModelChangeObserver(ABC):
    @abstractmethod
    def apply_update_model(self) -> None:
        pass

class IModelChanger(ABC):
    @abstractmethod
    def notify_changer(self, sender) -> None:
        pass

class ModelStore(IModelChanger):
    def __init__(self, changeObservers: List[IModelChangeObserver]) -> None:
        self.models = []
        self.scences = []
        self.flashes = []
        self.cameras = []

    def get_scene(self, id):
        for scene in self.scences:
            if scene.id == id:
                return scene
        return None
    
    def notify_changer(self, sender) -> None:
        return super().notify_changer(sender)
