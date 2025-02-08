
import com.example.store.StoreFeignClient;
import com.example.store.dto.StoreRequest;
import com.example.store.dto.StoreResponse;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/store")
public class StoreController {

    private final StoreFeignClient storeFeignClient;

    public StoreController(StoreFeignClient storeFeignClient) {
        this.storeFeignClient = storeFeignClient;
    }

    @PostMapping
    public String createStore(@RequestBody StoreRequest request) {
        // TODO #1: 매장을 생성하는 API 엔드포인트를 구현하세요.
        // 요구사항:
        // - StoreFeignClient를 사용하여 매장을 생성해야 합니다.
        // - 생성된 매장의 ID를 반환해야 합니다.
    }

    @GetMapping("/{storeId}")
    public StoreResponse getStore(@PathVariable String storeId) {
        // TODO #2: 특정 매장을 조회하는 API 엔드포인트를 구현하세요.
        // 요구사항:
        // - storeId를 기반으로 매장을 조회해야 합니다.
        // - 조회된 매장 정보를 반환해야 합니다.
    }

    @PutMapping("/{storeId}")
    public boolean updateStore(@PathVariable String storeId, @RequestBody StoreRequest request) {
        // TODO #3: 매장 정보를 업데이트하는 API 엔드포인트를 구현하세요.
        // 요구사항:
        // - storeId와 새로운 매장 정보를 사용하여 매장을 업데이트해야 합니다.
        // - 업데이트 성공 여부를 반환해야 합니다.
    }

    @DeleteMapping("/{storeId}")
    public boolean deleteStore(@PathVariable String storeId) {
        // TODO #4: 매장을 삭제하는 API 엔드포인트를 구현하세요.
        // 요구사항:
        // - storeId를 기반으로 매장을 삭제해야 합니다.
        // - 삭제 성공 여부를 반환해야 합니다.
    }
}
