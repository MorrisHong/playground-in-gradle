package kr.gracelove.board;

import io.grpc.stub.StreamObserver;

import java.util.HashMap;
import java.util.Map;

/**
 * @author : Eunmo Hong
 * @since : 2020/09/19
 */

public class BoardImpl extends BoardGrpc.BoardImplBase{

	private Map<Long, BoardOuterClass.Article> articleMap = new HashMap<>();

	@Override
	public void addArticle(BoardOuterClass.Article request, StreamObserver<BoardOuterClass.ArticleId> responseObserver) {
		request.
	}

	@Override
	public void getArticle(BoardOuterClass.ArticleId request, StreamObserver<BoardOuterClass.Article> responseObserver) {
		super.getArticle(request, responseObserver);
	}
}
