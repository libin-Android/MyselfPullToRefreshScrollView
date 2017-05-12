package pulltorefreshview.pulltorefresh;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.AnimationDrawable;
import android.graphics.drawable.Drawable;

import com.example.administrator.myselfpulltorefreshscrollview.R;

/**
 * 加载逐帧动画
 * Created by Administrator on 2016/11/30.
 */
public class TweenAnimLoadingLayout extends LoadingLayout  {

    private AnimationDrawable animationDrawable;

    public TweenAnimLoadingLayout(Context context, PullToRefreshBase.Mode mode,
                                  PullToRefreshBase.Orientation scrollDirection, TypedArray attrs) {
        super(context, mode, scrollDirection, attrs);
        animationDrawable = (AnimationDrawable) getResources().getDrawable(R.drawable.ani);
        mHeaderImage.setBackground(animationDrawable);
    }
    /**
     *  默认图片
     */
    @Override
    protected int getDefaultDrawableResId() {
        return R.mipmap.page_refresh;
    }

    @Override
    protected void onLoadingDrawableSet(Drawable imageDrawable) {
        // NO-OP
    }

    /**
     * 开始下拉时的回调
     * @param scaleOfLayout
     */
    @Override
    protected void onPullImpl(float scaleOfLayout) {
        // 播放帧动画
        animationDrawable.start();
        // NO-OP
    }

    /**
     * 下拉以刷新
     */
    @Override
    protected void pullToRefreshImpl() {
        // NO-OP
    }

    /**
     * 正在刷新时回调
     */
    @Override
    protected void refreshingImpl() {
    }

    /**
     *  释放以刷新
     */
    @Override
    protected void releaseToRefreshImpl() {
        // NO-OP
    }

    /**
     * 重新设置
     */
    @Override
    protected void resetImpl() {
        mHeaderImage.setVisibility(VISIBLE);
        mHeaderImage.clearAnimation();
    }
}
