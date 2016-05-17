package com.iranshao.iranshao.bean;

import java.util.List;

/**
 * Created by Administrator on 2016/5/17.
 */
public class TrainingBean {

    private boolean success;

    private ButtonsBean buttons;

    private List<CellsBean> cells;

    private List<SlidesBean> slides;

    private List<RacesBean> races;

    public boolean isSuccess() {
        return success;
    }
    public void setSuccess(boolean success) {
        this.success = success;
    }

    public ButtonsBean getButtons() {
        return buttons;
    }

    public void setButtons(ButtonsBean buttons) {
        this.buttons = buttons;
    }

    public List<CellsBean> getCells() {
        return cells;
    }

    public void setCells(List<CellsBean> cells) {
        this.cells = cells;
    }

    public List<SlidesBean> getSlides() {
        return slides;
    }

    public void setSlides(List<SlidesBean> slides) {
        this.slides = slides;
    }

    public List<RacesBean> getRaces() {
        return races;
    }

    public void setRaces(List<RacesBean> races) {
        this.races = races;
    }

    public static class ButtonsBean {


        private ClaimBean claim;

        private RegBean reg;

        public ClaimBean getClaim() {
            return claim;
        }

        public void setClaim(ClaimBean claim) {
            this.claim = claim;
        }

        public RegBean getReg() {
            return reg;
        }

        public void setReg(RegBean reg) {
            this.reg = reg;
        }

        public static class ClaimBean {
            private String text;
            private String link;

            public String getText() {
                return text;
            }

            public void setText(String text) {
                this.text = text;
            }

            public String getLink() {
                return link;
            }

            public void setLink(String link) {
                this.link = link;
            }
        }

        public static class RegBean {
            private String text;
            private String link;

            public String getText() {
                return text;
            }

            public void setText(String text) {
                this.text = text;
            }

            public String getLink() {
                return link;
            }

            public void setLink(String link) {
                this.link = link;
            }
        }
    }

    public static class CellsBean {
        private String text;
        private String link;
        private String icon;

        public String getText() {
            return text;
        }

        public void setText(String text) {
            this.text = text;
        }

        public String getLink() {
            return link;
        }

        public void setLink(String link) {
            this.link = link;
        }

        public String getIcon() {
            return icon;
        }

        public void setIcon(String icon) {
            this.icon = icon;
        }
    }

    public static class SlidesBean {
        private String img;
        private String link;

        public String getImg() {
            return img;
        }

        public void setImg(String img) {
            this.img = img;
        }

        public String getLink() {
            return link;
        }

        public void setLink(String link) {
            this.link = link;
        }
    }

    public static class RacesBean {
        private String cover;
        private String name;
        private String location;
        private String start_date;
        private int follows_count;
        private String url;

        public String getCover() {
            return cover;
        }

        public void setCover(String cover) {
            this.cover = cover;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getLocation() {
            return location;
        }

        public void setLocation(String location) {
            this.location = location;
        }

        public String getStart_date() {
            return start_date;
        }

        public void setStart_date(String start_date) {
            this.start_date = start_date;
        }

        public int getFollows_count() {
            return follows_count;
        }

        public void setFollows_count(int follows_count) {
            this.follows_count = follows_count;
        }

        public String getUrl() {
            return url;
        }

        public void setUrl(String url) {
            this.url = url;
        }
    }
}
