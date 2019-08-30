package com.one.games.controller;

import com.one.games.domain.vo.GameShoppingCartVo;
import com.one.games.service.GameShoppingCartService;
import com.one.games.utils.Result;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/**
 * 购物车
 * @author Administrator
 */
@RestController
@RequestMapping("/shop")
@Slf4j
public class GameShoppingCartController {

    @Resource
    GameShoppingCartService gameShoppingCartService;

    /**
     * 购物车的首页
     * @return
     */
    @RequestMapping("/shopAll")
    public Result shopAll(){
        try {
            List<GameShoppingCartVo> gameShoppingCartVos = gameShoppingCartService.selectGameShoppingCartVos();
            return Result.success(gameShoppingCartVos);
        }catch (Exception e){
            return Result.error();
        }
    }

    /**
     * 删除购物车某条数据的操作
     * @param gameCartId
     * @return
     */
    @RequestMapping("/deleteShop")
    public Result deleteShopCart(int gameCartId){
        try {
            int deleteShop = gameShoppingCartService.deleteGameShoppingCartVos(gameCartId);
            return Result.success(deleteShop);
        }catch (Exception e){
            return Result.error();
        }
    }

    /**
     * 商品添加购物车操作，根据gameId和userId查询一条数据，如果
     * 这条数据存在，则做数量+1的操作，如果不存在这条数据，则添
     * 加这条数据进购物车
     * @param gameId
     * @param userId
     * @return
     */
    @RequestMapping("/shopCart")
    public Result shopCartOperation(int gameId , int userId){
        try {
            int i = gameShoppingCartService.selectCartId(gameId, userId);
            return Result.success(i);
        }catch (Exception e){
            return Result.error();
        }
    }

    /**
     * 在购物车中做增加减少商品数量的操作
     * @param gameCartId
     * @param num
     * @return
     */
    @PostMapping("/shopCartNum")
    public Result shopCartNum(int gameCartId , int num){
        try {
            int i = gameShoppingCartService.shopCartNum(gameCartId, num);
            return Result.success(i);
        }catch (Exception e){
            return Result.error();
        }

    }
}
